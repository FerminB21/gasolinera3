package edu.persistencia.dto;

import org.springframework.stereotype.Service;

import edu.persistencia.dal.Factura;
import edu.persistencia.dal.Normal;
import edu.persistencia.dal.RepostajeGas;

//Servicio para convertir de DAO a DTO
@Service
public class DAOaDTO {

	//Método para convertir Repostajes Factura de DAO a DTO
	public FacturaDTO facturaDAOaDTO(Factura fact) {
		return new FacturaDTO(fact.getId_factura(), fact.getMd_date_factura(), fact.getPrecio_factura(), fact.getDni(), fact.getMatricula());
	}

	//Método para convertir Repostajes Normal de DAO a DTO
	public NormalDTO normalDAOaDTO(Normal nom) {
		return new NormalDTO(nom.getId_Normal(), nom.getMd_date_Normal(), nom.getPrecio_Normal());
	}
	
	//Método para convertir Repostajes de Gasolineras de DAO a DTO
	public RepostajeGasDTO repostGasDAOaDTO(RepostajeGas repo) {
		return new RepostajeGasDTO(repo.getId_repoGas(), repo.getFechaLlenado(), repo.getLitrosRepostados(), repo.getCoste(), repo.getTipoCombustible());
	}
}
