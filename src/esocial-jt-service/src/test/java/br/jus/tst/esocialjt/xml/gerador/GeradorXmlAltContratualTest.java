package br.jus.tst.esocialjt.xml.gerador;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.jus.tst.esocial.ocorrencia.Operacao;
import br.jus.tst.esocial.ocorrencia.TipoOcorrencia;
import br.jus.tst.esocial.ocorrencia.dados.AltContratual;
import br.jus.tst.esocial.ocorrencia.dados.IdeEvento;
import br.jus.tst.esocialjt.dominio.Evento;
import br.jus.tst.esocialjt.dominio.GrupoTipoEvento;
import br.jus.tst.esocialjt.dominio.Ocorrencia;
import br.jus.tst.esocialjt.dominio.TipoEvento;
import br.jus.tst.esocialjt.ocorrencia.ExemploOcorrenciaServico;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeradorXmlAltContratualTest {
	
	@Autowired
	GeradorXmlAltContratual gerador;

	@Test
	public void deveGerarXmlAltContratual() throws Exception {
		Evento evento = getEvento();
		evento.getOcorrencia().setOperacao(Operacao.ALTERACAO);
		String xml = gerador.gerarXml(evento);
		assertThat(xml).contains("evtAltContratual");
		assertThat(xml).contains("<indRetif>1</indRetif>");
	}

	@Test
	public void deveGerarXmlAltContratualRetificacao() throws Exception {
		Evento evento = getEvento();
		evento.getOcorrencia().setOperacao(Operacao.ALTERACAO);
		AltContratual ocorrencia = (AltContratual) evento.getOcorrencia().getDadosOcorrencia();
		ocorrencia.setIdeEvento(new IdeEvento().setIndRetif((byte)2).setNrRecibo("1.2.0000000000007498277"));
		String xml = gerador.gerarXml(evento);
		assertThat(xml).contains("evtAltContratual");
		assertThat(xml).contains("<indRetif>2</indRetif>");
	}
	
	private Evento getEvento() throws Exception {
		ExemploOcorrenciaServico exemplo = new ExemploOcorrenciaServico();
		Ocorrencia ocorrencia = exemplo.lerOcorrencia(TipoOcorrencia.ALTERACAO_CONTRATUAL);
		Evento evento = new Evento();
		evento.setOcorrencia(ocorrencia);
		ocorrencia.setEvento(evento);
		
		evento.setId(1l);
		evento.setIdEvento("ID1005099680001482017092708200100001");
		evento.setTipoEvento(TipoEvento.ALTERACAO_CONTRATUAL);
		evento.getTipoEvento().setGrupoTipoEvento(new GrupoTipoEvento(2l));
		
		return evento;
	}

}
