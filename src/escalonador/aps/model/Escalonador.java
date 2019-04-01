
package escalonador.aps.model;

import java.util.List;
import java.util.ArrayList;

public class Escalonador {
	private int tick;
	private int quantum;
	private List<Processo> processos;
	
	public Escalonador() {
		this.tick = 0;
		this.quantum = 5;
		this.processos = new ArrayList<>();
	}
	
	public void adicionarProcesso(Processo p) {
		this.processos.add(p);
	}
	
	public void finalizarProcesso(Processo p) {
		p.setStatus(Status.Finalizado);
	}
	
	public void removerProcesso(Processo p) {
		this.processos.remove(p);
	}
	
	public void tick(){
		this.tick += 1;
	}
	public int getTick(){
		return this.tick;
	}
	public String status() {
		String status = ("Tick: "+this.tick) + ", Quantum: " + this.quantum; 
		return status;
		
	}

	
}

