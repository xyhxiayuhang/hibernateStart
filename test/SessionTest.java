
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.Test;

public class SessionTest {

	@Test
	public void testOpenSession() {
		Configuration config = new Configuration().configure();// ������ö���
		// ��ȡ����ע�����
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties())
				.buildServiceRegistry();
		// ���sessionFactory����
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		// ���session����
		Session session = sessionFactory.openSession();
		if (session != null) {
			System.out.println("session�����ɹ�");
		} else {
			System.out.println("session����ʧ��");
		}
	}

	@Test
	public void testGetCurrentSession() {
		Configuration config = new Configuration().configure();// ������ö���
		// ��ȡ����ע�����
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties())
				.buildServiceRegistry();
		// ���sessionFactory����
		SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
		// ���session����
		Session session = sessionFactory.getCurrentSession();
		if (session != null) {
			System.out.println("session�����ɹ�");
		} else
			System.out.println("session����ʧ��");
	}
}
