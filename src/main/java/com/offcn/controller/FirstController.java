package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * @author LiLe
 * @create 2020-09-27 20:12
 */

@Controller
public class FirstController {

    @RequestMapping("/hello")
    public String indexPage(Model model){
        String message = "hello.this is Thymeleaf";
        model.addAttribute("message",message);
        return "index";
    }

    @RequestMapping("/showUser")
    public String showUser(Model model){
        User user = new User(20201001, "小白", 12);
        model.addAttribute("user",user);
        return "show";
    }

    @RequestMapping("/showMap")
    public String showMap(Model model){
        Map map=new HashMap();
        map.put("name","小黑");
        map.put("age",18);
        map.put("id",20201919);
        model.addAttribute("map",map);
        return "showMap";
    }

    @RequestMapping("/showList")
    public String showList(Model model){
        List<User> list = new ArrayList();
        list.add(new User(2020001,"小白",19));
        list.add(new User(2020002,"小白1",29));
        list.add(new User(2020003,"小白2",39));
        model.addAttribute("userList",list);
        return "showList";
    }

    @RequestMapping("/showString")
    public String showString(Model model){
        model.addAttribute("username","小兰");
        model.addAttribute("href","http://www.baidu.com");
        return "showString";
    }


    @RequestMapping("/showIF")
    public String showIf(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("users","admin");
        model.addAttribute("manager","manager");
        return "showIf";
    }

    @RequestMapping("/showHead")
    public String showHead(Model model){
        return "showHead";
    }

    @RequestMapping("/showFunc")
    public String showFunc(Model model){
        // 日期格式
        Date date = new Date();
        model.addAttribute("date",date);
        // 数值格式
        double price = 123.456789;
        model.addAttribute("price",price);
        // 长文本格式
        String str = "Thymeleaf是一个流行的模板引擎，该模板引擎采用Java语言开发，模板引擎是一个技术名词，是跨领域跨平台的概念，在Java语言体系下有模板引擎，在C#、PHP语言体系下也有模板引擎。除了thymeleaf之外还有Velocity、FreeMarker等模板引擎，功能类似。\n" +
                "\n" +
                "Thymeleaf的主要目标在于提供一种可被浏览器正确显示的、格式良好的模板创建方式，因此也可以用作静态建模。你可以使用它创建经过验证的XML与HTML模板。使用thymeleaf创建的html模板可以在浏览器里面直接打开（展示静态数据），这有利于前后端分离。需要注意的是thymeleaf不是spring旗下的。这里我们使用thymeleaf 3版本。";
        model.addAttribute("str",str);
        return "showFunc";
    }

}
