package com.example.myapp.lotto.svc.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.jdbc.core.metadata.TableMetaDataProvider;
import org.springframework.stereotype.Service;

import com.example.myapp.lotto.svc.LottoSvc;
import com.example.myapp.lotto.vo.LottoVO;

@Service
public class LottoSvcImpl implements LottoSvc{

	@Override
	public List<LottoVO> createNum(int num) {
		List<LottoVO> list = new ArrayList<>();
		Random random = new Random();
		int randomNumber;
		for(int i = 0; i < num; i++) {
			List<Integer> temp = new ArrayList<>();
			LottoVO vo = new LottoVO();
			for(int j = 0; j < 6; j++) {
				randomNumber = random.nextInt(45)+1;
				if(temp.contains(randomNumber)) {
					j--;
				}else {
					temp.add(randomNumber);
				}
			}
			temp.sort(null);
			vo.setNumber(temp);
			list.add(vo);
			
			for(int k = 0; k < 6; k++) {
				System.out.print(vo.getNumber().get(k)+", ");
			}
			System.out.println();
		}
		return list;
	}
}
