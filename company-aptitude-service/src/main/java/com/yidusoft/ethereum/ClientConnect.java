package com.yidusoft.ethereum;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;

import java.lang.String;

public class ClientConnect {
     //连接以太坊客户端
       public Web3j getConn(String ip ){
           Web3j web3j=null;
           try{
             web3j = Web3j.build(new HttpService(ip));
            //客户端版本号
            //Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().sendAsync().get();
          //  String clientVersion = web3ClientVersion.getWeb3ClientVersion();

        }catch (Exception e){
            System.err.println("连接失败！");
            web3j=null;
        }
         return web3j;
     }


        }