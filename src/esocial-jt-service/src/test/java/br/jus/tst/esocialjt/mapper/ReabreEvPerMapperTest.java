package br.jus.tst.esocialjt.mapper;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.jus.tst.esocial.esquemas.eventos.reabreevper.ESocial.EvtReabreEvPer;
import br.jus.tst.esocial.ocorrencia.dados.ReabreEvPer;
import br.jus.tst.esocialjt.CriadorObjetoAleatorio;
import br.jus.tst.esocialjt.mapper.infrateste.MapperAssertion;

public class ReabreEvPerMapperTest {
	
	@Test
	public void deveMapearEvento() {
		ReabreEvPer reabreEvPer = CriadorObjetoAleatorio.criarEPreencher(ReabreEvPer.class);
		EvtReabreEvPer evtReabreEvPer = ReabreEvPerMapper.INSTANCE.comoEvtReabreEvPer(reabreEvPer);
		
		Assertions
			.assertThat(evtReabreEvPer.getIdeEvento())
			.isEqualToIgnoringGivenFields(reabreEvPer.getIdeEvento(), "tpAmb", "procEmi", "verProc");

		MapperAssertion
			.assertThat(evtReabreEvPer.getIdeEmpregador())
			.isEqualToComparingFieldByFieldRecursively(reabreEvPer.getIdeEmpregador());

	}
}
