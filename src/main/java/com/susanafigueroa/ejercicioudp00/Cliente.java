package com.susanafigueroa.ejercicioudp00;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Cliente {

    private DatagramSocket clientSocket;
    private InetAddress ipServidor;
    private int puertoServidor;

    public void init(String host, int port) throws SocketException, UnknownHostException {
        // inicializo el clientSocket para que el cliente pueda enviar datagramas al servidor
        // y pueda recibir datagramas del servidor
        clientSocket = new DatagramSocket();

        // inicializo la IP del servidor para que el cliente pueda enviar datagramas al servidor
        // y pueda recibir datagramas del servidor
        ipServidor = InetAddress.getByName(host);

        // puerto del servidor para que el cliente pueda enviar datagramas al servidor
        // y pueda recibir datagramas del servidor
        puertoServidor = port;
    }

    // main para ejecutar el cliente
    public static void main(String[] args) {

    }
}
