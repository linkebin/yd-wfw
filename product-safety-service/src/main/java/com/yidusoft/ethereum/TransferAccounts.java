package com.yidusoft.ethereum;

import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.Request;
import org.web3j.protocol.core.Response;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.protocol.core.methods.response.EthAccounts;
import org.web3j.protocol.core.methods.response.EthSendTransaction;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.parity.Parity;
import org.web3j.protocol.parity.methods.response.PersonalUnlockAccount;

import java.math.BigInteger;
import java.util.concurrent.CompletableFuture;

/**
 * Created by zcb on 2017/7/11.
 * 交易以太币进行转账
 */
public class TransferAccounts {

   //初始化ip
    private static String ip= "http://localhost:8545/";
   //主账号
   static final String account="0x64CcB97B08F06E798dD4e527Dc6e428ceFF27BD2";
    // 钱包密码
    static   final  String password = "yyy";
    //交易账号
    static final String toAccount="0xF3a97fd00E2899D8bc62aebB73737DbE3163B079";
    private static Web3j web3j=null;
    public  TransferAccounts(){
        //连接以太坊客户端
        ClientConnect clientConnect=new ClientConnect();
         web3j=  clientConnect.getConn(ip);
    }
    /**
     * 转账交易
     * 交易成功返回一个哈希值
     */
    public  static  String saveTransferAccounts(String fromAccount,String toAccount,String data, String value ){

        String tradeHash="";
        try{
            //连接客户端
         //   Parity parity=Parity.build(new HttpService());
            //解锁账户

           // EthAccounts ethAccounts= web3j.ethAccounts().sendAsync().get();
           // CompletableFuture<PersonalUnlockAccount> completableFuture=parity.personalUnlockAccount(account,password,new BigInteger("100")).sendAsync();
          //  PersonalUnlockAccount personalUnlockAccount=completableFuture.get();
           //是否解锁

              //数据转换成十六进制
              String encode=encode(data);
              //写入交易事物
              Transaction transaction = Transaction.createFunctionCallTransaction(fromAccount,null,null,null,toAccount,
                      new BigInteger(value),encode);
              //向以太坊客户端提交交易
              EthSendTransaction ethSendTransaction =web3j.ethSendTransaction(transaction).send();
              //得到交易成功返回的哈希值
              tradeHash = ethSendTransaction.getTransactionHash();

        }catch (Exception e){
            System.err.println("交易失败！");
             tradeHash="";
        }

        return tradeHash;
    }

    /***
     *
     * 查询以太坊的交易信息
     */
    public  static String getTransactionData(String hash){
        String data="";
        try{
            //写入请求交易信息
            Request request = web3j.ethGetTransactionByHash(hash);
            //发送请求，返回交易信息
            Response<org.web3j.protocol.core.methods.response.Transaction> response = request.send();
            //得到交易的信息
            org.web3j.protocol.core.methods.response.Transaction transaction =response.getResult();
            //得到交易时输入的数据信息
            String input= transaction.getInput();
            String inputRep=input.replace("0x","");
            //将十六进制转换成字符串
             data=hexToStringGBK(inputRep);

        }catch (Exception e){
            e.printStackTrace();;
        }

     return  data;
    }



    /**
     * 将字符串转为十六进制
     */
    private static String hexString="0123456789ABCDEF";
    public static String encode(String str)
    {
        //根据默认编码获取字节数组
        byte[] bytes;
        StringBuilder sb=null;;
        try {
            bytes = str.getBytes();
            sb=new StringBuilder(bytes.length*2);
            for(int i=0;i<bytes.length;i++)
            {
                sb.append(hexString.charAt((bytes[i]&0xf0)>>4));
                sb.append(hexString.charAt((bytes[i]&0x0f)>>0));
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //将字节数组中每个字节拆解成2位16进制整数

        return sb.toString();
    }
    /**
     * 将十六进制转为字符串
     */
    public static String hexToStringGBK(String content) {
        byte[] baKeyword=new byte[content.length() / 2];
        for (int i=0;i<baKeyword.length;i++){
            try{
                baKeyword[i]=(byte)(0xff & Integer.parseInt(content.substring(i*2,i*2+2),16));
            }catch(Exception e){
                e.printStackTrace();
                return "";
            }
        }
        try{
            content=new String(baKeyword,"utf-8");// UTF-16le:Not
        } catch(Exception e1) {
            e1.printStackTrace();
            return "";
        }
        return content;
    }

    /*public static void main(String[] args) throws Exception {
        TransferAccounts ss=   new TransferAccounts();
        String sss=TransferAccounts.getTransactionData("0xca34289bed843ae72a507018fd055a436d7f13d48eee46d66fa24c32ab5b58bd");
        System.err.println(sss);

    }*/

}
