package com.udcredit.biss.email.inf;

import java.io.IOException;

public interface EmailSenderBeanRemote {
	public void sendEmail(String configName, String from, String to, String subject, String htmlText,String cc)
			throws IOException;

}
