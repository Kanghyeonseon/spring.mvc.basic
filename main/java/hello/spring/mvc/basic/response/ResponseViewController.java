package hello.spring.mvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {
    
    // ModelAndView 리턴
    @RequestMapping("/response-view-v1")
    public ModelAndView responseView1(){
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");
        return mav;
    }

    // String 리턴
    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model) {
        model.addAttribute("data", "hello!!");
        return "response/hello"; //@Controller 이면서 반환형이 String이면 반환값은 view의 논리적인 이름이 된다.
    }

    // void
    @RequestMapping("/response/hello") // Controller의 이름과 view의 논리적 이름이 같으면 반환을 생략할 수 있게 해준다. 이 값이 뷰의 논리적 이름이 된다.
    public void responseViewV3(Model model) {
        model.addAttribute("data", "hello!!!");
    }
}
