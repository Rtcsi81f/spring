package edu.zjnu;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: EnvironmentAware
 * @author:
 * @date: 2022-01-31
 **/
@Controller
@RequestMapping("/env")
public class EnvironmentController implements EnvironmentAware {

    private Environment environment = null;

    @RequestMapping("/toEnv")
    public String toEnvAware(Model model) {
        System.out.println(environment.toString());
        model.addAttribute("resultStr", "请求成功");
        return "请求成功";
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
