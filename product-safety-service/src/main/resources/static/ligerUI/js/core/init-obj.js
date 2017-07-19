/**
 * Created by Administrator on 2017/7/6.
 */
var _tabs =null;
 //得到tab对象
function  initTabObj(id,height){
    //Tab
    _tabs = $("#"+id).ligerTab({
        height: height,
        showSwitchInTab : true,
        showSwitch: true,
        onAfterAddTabItem: function (tabdata)
        {

        },
        onAfterRemoveTabItem: function (tabid)
        {

        },
        onReload: function (tabdata)
        {

        }
    });
}
//打开新的tab页
function f_addTab1(tabid, text, url,obj,height)
{
    obj.addTabItem({
        tabid: tabid,
        text: text,
        url: url,
        height:height,
        callback: function ()
        {

        }
    });
}

//首页的tab打开
function f_addTab(tabid, text, url,obj)
{
    top.tab.removeTabItem('listpage');
    obj.addTabItem({
        tabid: tabid,
        text: text,
        url: url,
        callback: function ()
        {

        }
    });
}

function attachLinkToFrame(iframeId, filename)
{
    if(!window.frames[iframeId]) return;
    var head = window.frames[iframeId].document.getElementsByTagName('head').item(0);
    var fileref = window.frames[iframeId].document.createElement("link");
    if (!fileref) return;
    fileref.setAttribute("rel", "stylesheet");
    fileref.setAttribute("type", "text/css");
    fileref.setAttribute("href", filename);
    head.appendChild(fileref);
}

function getLinkPrevHref(iframeId)
{
    if (!window.frames[iframeId]) return;
    var head = window.frames[iframeId].document.getElementsByTagName('head').item(0);
    var links = $("link:first", head);
    for (var i = 0; links[i]; i++)
    {
        var href = $(links[i]).attr("href");
        if (href && href.toLowerCase().indexOf("ligerui") > 0)
        {
            return href.substring(0, href.toLowerCase().indexOf("lib") );
        }
    }
}