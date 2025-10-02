package br.univille;

import com.azure.core.amqp.AmqpTransportType;
import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusSenderClient;

public class Producer {
    public static void main(String[] args) {
        var servidor="sb-das1-2025.servicebus.windows.net";
        var chave= System.getenv("CHAVE");
        var queue = "queue-aliciaschiochet";


         ServiceBusSenderClient senderClient =
            new ServiceBusClientBuilder()
            .fullyQualifiedNamespace(servidor)
            .transportType(AmqpTransportType.AMQP_WEB_SOCKETS)
            // .credential(credential)
            .connectionString(chave)
            .sender()
            .queueName(queue)
            .buildClient();
            
        senderClient.sendMessage(
            new ServiceBusMessage(
                "1: Alícia: Uauuuu!"));
                senderClient.sendMessage(
            new ServiceBusMessage(
                "2: Alícia: Uauuuu!"));
                senderClient.sendMessage(
            new ServiceBusMessage(
                "3: Alícia: Uauuuu!"));
    }

}
