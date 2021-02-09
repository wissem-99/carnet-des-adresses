package exeman;

public class record_c_c {
client c;
carnet cc;


public record_c_c(client c, carnet cc) {
	this.c = c;
	this.cc = cc;
}


public client getC() {
	return c;
}


public carnet getCc() {
	return cc;
}


public void setC(client c) {
	this.c = c;
}


public void setCc(carnet cc) {
	this.cc = cc;
}

}
