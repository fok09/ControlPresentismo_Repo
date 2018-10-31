package srv;

import java.util.List;

import bean.Cliente;
import bean.Servicio;
import dao.ServicioDAO;

public class ServicioSrv {
private static ServicioDAO dao;
	
	static {
		dao = ServicioDAO.getInstancia();
	}
	
	
	public static void grabarServicio(Servicio servicio){
		dao.grabarServicio(servicio);
	}
	
	public static Servicio getServicio(int idServicio){
		return dao.getById(idServicio);
	}
	
	public static List<Servicio> getServicios(){
		return dao.getServicios();
	}
}