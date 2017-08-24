package Pacote1;

import Pacote2.ClasseDefautPacote2;
import Pacote2.ClassePublicPacote2;

public class ClassePublicPacote1 {
	
	public ClassePublicPacote1() {
		ClassePublicPacote1 x = new ClassePublicPacote1();
		ClassePublicPacote2 y = new ClassePublicPacote2();
		ClasseDefautPacote1 z = new ClasseDefautPacote1();
		ClasseDefautPacote2 w = new ClasseDefautPacote2();
		
		x.metodoPrivate();
		x.metodoDefaut();
		x.metodoProtected();
		x.metodoPublico();
		
		y.metodoPrivatePacote2();
		y.metodoDefautPacote2();
		y.metodoProtectedPacote2();
		y.metodoPublicoPacote2();
		
		//so pode ser usado pela propria classe
		z.metodoPrivate();
		z.metodoDefaut();
		z.metodoProtected();
		z.metodoPublico();
		
		//o metodo private so pode ser ultilizado pela sua propria classe do mesmo pacote
		w.metodoPrivate();
		//o metodo pode ser usados por todas as classe do mesmo pacote
		w.metodoDefaut();
		//o metodo so pode ser usado pelas do mesmo pacote
		w.metodoProtected();
		w.metodoPublico();
		
		
		
		
	}
	public void metodoPublico() {
		
	}
	void metodoDefaut() {
		
	}
	private void metodoPrivate() {
		
	}
	protected void metodoProtected() {
		
	}

}
