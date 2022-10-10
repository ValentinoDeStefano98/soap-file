package com.upload.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.soap.service.FileSendService;
import com.soap.service.impl.FileSendServiceImpl;
import com.upload.utils.FileUtil;


@WebServlet("/Upload")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UploadServlet() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Part filePart = request.getPart("file");
		String uploadSubmit = request.getParameter("uploadFile");
		String fileName = FileUtil.getFilename(filePart);
		
		if(uploadSubmit != null && fileName != null && fileName.length() > 0) {
			
			InputStream inputStream = filePart.getInputStream();
			byte[] fileContent = FileUtil.getFileContent(inputStream);
			
			FileSendServiceImpl service = new FileSendServiceImpl();
			
			FileSendService fileSendService = service.getFileSendServiceImplPort();
			
			String resp = fileSendService.sendFile(fileContent, fileName);
			
			if (!resp.contains ("Errore")){
				request.setAttribute("success", resp);
			} else {
				request.setAttribute("error", resp);

			}
		} else {
			String msg = "Attenzione - seleziona un file";
			request.setAttribute("error", msg);

		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
		requestDispatcher.forward(request, response);

	}
}
