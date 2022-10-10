package com.soap.service.impl;

import javax.jws.WebService;

import com.soap.service.FileSendService;
import com.soap.service.util.FileUtils;

@WebService(endpointInterface = "com.soap.service.FileSendService")
public class FileSendServiceImpl implements FileSendService {
	@Override
	public String sendFile(byte[] fileContent, String fileName) {
		boolean response = FileUtils.saveFile(fileContent, fileName);
		if (response) {
			return "File caricato";
		}
		return "Qualcosa è andato storto";
	}

	public FileSendService getFileSendServiceImplPort() {
		// TODO Auto-generated method stub
		return null;
	}



}
