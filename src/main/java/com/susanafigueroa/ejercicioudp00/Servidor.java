package com.susanafigueroa.ejercicioudp00;

import java.net.DatagramSocket;
import java.net.SocketException;

public class Servidor {

    private DatagramSocket serverSocket;

    public void init(int puertoCliente) throws SocketException {
        // inicializo el serverSocket para poder enviar datagramas al cliente y recibir datagramas
        // del cliente
        serverSocket = new DatagramSocket(puertoCliente);
    }

    // main para ejecutar el servidor
    public static void main(String[] args) {

    }
}
