package Persona;

public class Paciente {
		//1 Atributos 
		String numeroSeguroSocial;
		String tipoSangre;
		boolean expediente;
		private boolean seguroGastosMedicos;
		String cita;
		String doctorAsignado;
		boolean alergias;
	
		
		//2 Contructor que recopile todos los datos
		Paciente(String numeroSeguroSocial, String tipoSangre, boolean expediente, boolean seguroGastosMedicos,
				String cita, String doctorAsignado, boolean alergias) {
			this.numeroSeguroSocial = numeroSeguroSocial;
			this.tipoSangre = tipoSangre;
			this.expediente = expediente;
			this.seguroGastosMedicos = seguroGastosMedicos;
			this.cita = cita;
			this.doctorAsignado = doctorAsignado;
			this.alergias = alergias;
		}//contructor general
		
		//2.1 Contructor que recopile solo los datos requeridos u obligatorios
		Paciente (String numeroSeguroSocial, boolean expediente, boolean seguroGastosMedicos){
			this.numeroSeguroSocial = numeroSeguroSocial;
			this.expediente = expediente;
			this.seguroGastosMedicos = seguroGastosMedicos;
		}//constructor con campos obligatorios

		
		

	
		//3 Metodos
		@Override
		//Metodo llamado toString que utiliza datos del tipo String
		public String toString() {
			return "Paciente [numeroSeguroSocial=" + numeroSeguroSocial + ", tipoSangre=" + tipoSangre + ", expediente="
					+ expediente + ", seguroGastosMedicos=" + seguroGastosMedicos + ", cita=" + cita
					+ ", doctorAsignado=" + doctorAsignado + ", alergias=" + alergias + "]";
		}
		
		
		//getter 
		public boolean getSeguroGastosMedicos() {
			return seguroGastosMedicos;
		}
		//setter
		public void setSeguroGastosMedicos(boolean seguroGastosMedicos) {
			this.seguroGastosMedicos = seguroGastosMedicos;
			
		}
		
}//class paciente
