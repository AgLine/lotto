package com.example.lotto.lotto.svc;


import com.example.lotto.lotto.vo.LottoVO;

import java.util.List;

public interface LottoSvc {
    List<LottoVO> createNum(int num);
}
