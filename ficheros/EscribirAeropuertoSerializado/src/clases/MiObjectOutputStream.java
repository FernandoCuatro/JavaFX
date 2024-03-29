package clases;

import java.io.*;

public class MiObjectOutputStream extends ObjectOutputStream {

    /**
     * Constructor que recibe OutputStream
     *
     * @param out OutputStream
     * @throws java.io.IOException IOException
     */
    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out); //Llama al constructor de la superclase(OutputStream)
    }

    /**
     * Constructor sin parámetros
     *
     * @throws java.io.IOException IOException
     */
    protected MiObjectOutputStream() throws IOException, SecurityException {
        super(); //Llama al constructor de la superclase(OutputStream)
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        //No hacemos nada
    }
}
