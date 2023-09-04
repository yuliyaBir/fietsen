package be.vdab.fietsen.exceptions;

public class CampusHeeftDezeDocentAlException extends RuntimeException {
    public CampusHeeftDezeDocentAlException() {
        super("Campus heeft deze docent al.");
    }
}
