package com.bank.retailbanking.constants;

import org.springframework.stereotype.Component;

@Component
public class ApplicationConstants {
	private ApplicationConstants() {

	}

	public static final Integer FUND_TRANSFER_SUCCESS_CODE = 200;
	public static final String FUND_TRANSFER_SUCCESS_MESSAGE = "Your transaction is successfull";

	public static final String FUND_TRANSFER_PURPOSE_MESSAGE = "Food";

	public static final String FUND_TRANSFER_ACCOUNT_TYPE = "Savings";

	public static final String CUSTOMER_NOT_FOUND_MESSAGE = "Please check your id entered";

	public static final String AMOUNT_LESSBALANCE_MESSAGE = "You don't have a sufficicent balance in your account";

	public static final String TRANSACTION_SUCCESS_MESSAGE = "Success";

	public static final String TRANSACTION_FAILURE_MESSAGE = "Failure";

	public static final String TRANSACTION_DEBIT_MESSAGE = "Debit";

	public static final String TRANSACTION_CREDIT_MESSAGE = "Credit";

	public static final String ACCOUNTNUMBER_INVALID_MESSAGE = "You cannot transfer amount to your account itself";

}
