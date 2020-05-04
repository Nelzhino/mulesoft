package com.udemy;

public class Utils {

	private VehicleBean vehicleBean;
	
	public VehicleBean changeModel(String name, int model){
		this.vehicleBean = new VehicleBean();
		
		this.vehicleBean.setModel(model+1);
		this.vehicleBean.setName(name);
		
		return vehicleBean;
	}
	
	
	public String getError(int estado){
		
		String error = null;
		
		
		if(estado == 1){
			int i = 3 / 0;
		}
		else{
			error = error.substring(0);
		}
		
		
		return "";
		
	}
	
	public IdentificacionBean getData(){
		IdentificacionBean identificacionBean = new IdentificacionBean();
		DatosBean datosBean = new DatosBean();
		datosBean.setPlaca("SO-302");
		datosBean.setSim("12321334234");
		
		identificacionBean.setDatosBean(datosBean);
		
		identificacionBean.setCodigo("abc123");
		identificacionBean.setUsuario("Irving");
		
		return identificacionBean;
	}
}
