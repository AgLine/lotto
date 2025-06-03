package com.example.lotto.lotto.web;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

import com.example.lotto.lotto.svc.LottoSvc;
import com.example.lotto.lotto.vo.LottoVO;

@Controller
public class LottoCtrl {
    @Autowired
    private LottoSvc lottoSvc;

    /**
     * 처음화면
     *
     * 파일명 : lotto
     * 작성일 : 2021. 8. 10. 오전 10:09:21
     * 작성자 : 김은선
     * @return
     */
    @GetMapping("/")
    public ModelAndView lotto() {
        ModelAndView mav = new ModelAndView("lotto/lotto");
        return mav;
    }

    @RequestMapping("/lotto/num")
    @ResponseBody
    public Map<String, Object> createNum(HttpServletRequest httpServletRequest, LottoVO lottoVO) {
        Map<String, Object> resultMap = new HashMap<>();
        int num = Integer.parseInt(httpServletRequest.getParameter("num"));
        resultMap.put("result", lottoSvc.createNum(num));
        //lottoSvc.createNum(num);
        return resultMap;
    }
}
