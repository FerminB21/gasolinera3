package edu.persistencia.dto;

import org.springframework.stereotype.Service;

import edu.persistencia.dal.Factura;
import edu.persistencia.dal.Normal;
import edu.persistencia.dal.RepostajeGas;

@Service
public class DTOaDAO {
	
	public Factura facturaDTOaDAO(FacturaDTO fact) {
		return new Factura(fact.getId_factura(), fact.getMd_date_factura(), fact.getPrecio_factura(), fact.getDni(), fact.getMatricula());
	}

	public Normal normalDTOaDAO(NormalDTO nom) {
		return new Normal(nom.getId_Normal(), nom.getMd_date_Normal(), nom.getPrecio_Normal());
	}
	
	public RepostajeGas repostGasDTOaDAO(RepostajeGasDTO repo) {
		return new RepostajeGas(repo.getId_repoGas(), repo.getFechaLlenado(), repo.getLitrosRepostados(), repo.getCoste(), repo.getTipoCombustible());
	}
}
