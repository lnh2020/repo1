package cool.lnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickCintroller {
    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "测试Springboot是否成功!";
    }

    public void test(){
        System.out.println("123");
    }
}
