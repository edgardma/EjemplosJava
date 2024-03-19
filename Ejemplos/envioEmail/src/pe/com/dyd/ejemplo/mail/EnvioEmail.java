package pe.com.dyd.ejemplo.mail;

import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnvioEmail {
	
	static final String FROM = "sicu@mailserver.ue003cofopri.gob.pe";
	static final String FROMNAME = "administrador";
	static final String TO = "sicu@mailserver.ue003cofopri.gob.pe";
	static final String SMTP_USERNAME = "sicu@mailserver.ue003cofopri.gob.pe";
	static final String SMTP_PASSWORD = "S1c4$C0ntact0$";
	static final String CONFIGSET = "ConfigSet";
	static final String HOST = "172.16.16.99";
	static final int PORT = 25;
	static final String SUBJECT = "Ejemplo de envío de correo";
	static final String BODY = "<h1>Prueba</h1>";

	public static void main(String[] args) throws UnsupportedEncodingException, MessagingException {
		Properties props = System.getProperties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.port", PORT);
		props.put("mail.smtp.starttls.enable", "false");
		props.put("mail.smtp.auth", "false");
		
		Session session = Session.getDefaultInstance(props);
		MimeMessage msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(FROM, FROMNAME));
		msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
		msg.setSubject(SUBJECT);
		msg.setContent(BODY, "text/html");
		msg.setHeader("X-SES-CONFIGURATION-SET", CONFIGSET);
		Transport transport = session.getTransport();
		
		try {
			System.out.println("Sending...");
			transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
			transport.sendMessage(msg, msg.getAllRecipients());
			System.out.println("¡Email Enviado!");
		} catch (Exception ex) {
			System.out.println("El email no se ha podido enviar.");
			System.out.println("Error message: " + ex.getMessage());
		} finally {
			transport.close();
		}
	}

}
