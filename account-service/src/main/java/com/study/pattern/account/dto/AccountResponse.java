package com.study.pattern.account.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class AccountResponse <T> {
	
	private T accountInfo;

}
