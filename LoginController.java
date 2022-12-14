package controller;

import java.io.IOException;

import dao.KhachHangDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.KhachHang;

@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");

		String action = request.getParameter("action");

		String taiKhoan = request.getParameter("taiKhoan");
		String matKhau = request.getParameter("matKhau");
		String tenKhachHang = request.getParameter("ten");
		String gioiTinh = request.getParameter("gioiTinh");
		String soDienThoai = request.getParameter("soDienThoai");
		String email = request.getParameter("email");

		String ngay = request.getParameter("ngay");
		String thang = request.getParameter("thang");
		String nam = request.getParameter("nam");

		String ngaySinh = nam + "-" + thang + "-" + ngay;
		String diaChi = request.getParameter("diaChi");
		String soLuongMua = request.getParameter("soLuongMua");
		String role = request.getParameter("role");

		if (action == null) {
			System.out.println("Khong thuc hien gi het");
		} else if (action.equals("Login")) {
			// Neu ton tai taikhoan va matkhau nay thi dang nhap
			String userName = request.getParameter("username");
			String passWord = request.getParameter("password");
			// Tao session quan ly phien lam viec cua khach hang
			if (new KhachHangDAO().checkLogin(userName, passWord)) {
				HttpSession session = request.getSession();
				KhachHang kh = KhachHangDAO.mapKhachHang.get(userName);
				session.setAttribute("userlogin", kh);
			}
		} else if (action.equals("Res")) {
			String quyen = "";
			if (role != null && role.equals("0107")) {
				quyen = "admin";
			} else {
				quyen = "customer";
			}
			KhachHang kh = new KhachHang(taiKhoan, matKhau, tenKhachHang, gioiTinh, soDienThoai, email, ngaySinh,
					diaChi, soLuongMua, quyen);
			HttpSession session = request.getSession();
			KhachHangDAO.mapKhachHang.put(kh.getTaiKhoan(), kh);
			// sau khi dang khi thanh cong, truc tiep dang nhap
			new KhachHangDAO().add(kh);
			session.setAttribute("userlogin", kh);
		} else if (action.equals("Logout")) {
			HttpSession session = request.getSession();
			session.invalidate();
		}

		response.sendRedirect("account.jsp");
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
