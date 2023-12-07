// // import java.io.IOException;
 
// // import javax.servlet.annotation.MultipartConfig;
// // import javax.servlet.annotation.WebServlet;
// // import javax.servlet.http.HttpServlet;
// // import javax.servlet.http.HttpServletRequest;
// // import javax.servlet.http.HttpServletResponse;
 
// // @WebServlet("/uploadFiles")
// // @MultipartConfig(
// //         fileSizeThreshold   = 1024 * 1024 * 1,  // 1 MB
// //         maxFileSize         = 1024 * 1024 * 10, // 10 MB
// //         maxRequestSize      = 1024 * 1024 * 15, // 15 MB
// //         location            = "D:/Uploads"
// // )
// // public class MultiPartConfig extends HttpServlet {
 
// //     public void doPost(HttpServletRequest request, HttpServletResponse response)
// //             throws IOException {

                
       
// //     }
// // }


// import java.io.File;
// import java.io.IOException;
// import java.io.InputStream;
// import java.nio.file.Files;
// import java.nio.file.StandardCopyOption;
// import javax.servlet.ServletException;
// import javax.servlet.annotation.MultipartConfig;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import javax.servlet.http.Part;

// @WebServlet("/uploadFiles")
// @MultipartConfig(
//     fileSizeThreshold = 1024 * 1024,   // 1 MB
//     maxFileSize = 1024 * 1024 * 10,   // 10 MB
//     maxRequestSize = 1024 * 1024 * 15 // 15 MB
// )
// public class MultiPartConfig extends HttpServlet {

//     protected void doPost(HttpServletRequest request, HttpServletResponse response)
//             throws ServletException, IOException {
//         // Retrieve the file part from the request
//         Part filePart = request.getPart("file");

//         // Get the filename from the part
//         String fileName = getSubmittedFileName(filePart);

//         // Specify the directory where you want to save the uploaded files
//         String uploadDirectory = "D:/Uploads/";

//         try (InputStream fileContent = filePart.getInputStream()) {
//             // Save the uploaded file to the specified directory
//             Files.copy(fileContent, new File(uploadDirectory + fileName).toPath(), StandardCopyOption.REPLACE_EXISTING);
//         }

//         response.getWriter().write("File uploaded successfully.");
//     }

//     private String getSubmittedFileName(Part part) {
//         for (String contentDisposition : part.getHeader("content-disposition").split(";")) {
//             if (contentDisposition.trim().startsWith("filename")) {
//                 return contentDisposition.substring(contentDisposition.indexOf('=') + 1).trim().replace("\"", "");
//             }
//         }
//         return null;
//     }
// }

