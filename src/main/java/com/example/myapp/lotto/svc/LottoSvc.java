package com.example.myapp.lotto.svc;

import java.util.List;

import com.example.myapp.lotto.vo.LottoVO;

public interface LottoSvc {
	
	List<LottoVO> createNum(int num);
}
