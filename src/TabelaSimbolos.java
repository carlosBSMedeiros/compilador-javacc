

import java.util.HashMap;

public class TabelaSimbolos {

	private HashMap<String, Simbolo> tab;
	private int quantWarns = 0;

	public TabelaSimbolos() {
		this.tab = new HashMap<String, Simbolo>();
	}

	public boolean inclui(Simbolo _simb) throws ErroSemanticoException{
		if (this.tab.containsKey(_simb.getNome()))
			throw new ErroSemanticoException("Erro semantico -> Variavel "+_simb.getNome()+ " já foi declarada");
		else {
			this.tab.put(_simb.getNome(), _simb);
			return true;
		}
	}
	
	public boolean foiInicializada(String chave) throws ErroSemanticoException{
		if(!this.tab.containsKey(chave)) {
			throw new ErroSemanticoException("Erro semantico -> nao foi encontrada variavel " +chave+ " na tabela de simbolos");
		}
		
		if(this.tab.get(chave).getInicializada() == 's') {
			return true;
		} 
		
		return false;
	}
	
	public void inicializarSimbolo(String chave) {
		Simbolo s = this.tab.get(chave);
		s.setInicializada('s');
		this.tab.put(chave, s);
	}
	
	public void limparTabela() {
		this.tab.clear();
	}

	public int consultaReferencia(String _chave) {
		return ((Simbolo) this.tab.get(_chave)).getReferencia();
	}

	public boolean isExiste(String _chave) {
		return this.tab.containsKey(_chave);
	}
	
	public Simbolo getSimb(String chave) {
		return this.tab.get(chave);
	}
	
	public String toString() {
		 
		StringBuilder strb = new StringBuilder();
		StringBuilder warnVarInic = new StringBuilder();
						
		this.tab.forEach((k,v)->{
			strb.append(v.toString()).append("");
			if(v.getInicializada() == 'n') {
				warnVarInic.append(k).append(" ");
				quantWarns++;
			}
		});
		
		strb.append("\r\n").append("WARNINGS encontrados = ").append(quantWarns).append("\r\n");
		
		if(!warnVarInic.toString().trim().isEmpty()) {
			strb.append("Variáveis não inicializadas:").append("\r\n").append(warnVarInic);
		}

		
		return strb.toString();
	}

}