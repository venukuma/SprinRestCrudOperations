package venu.practise.spring.rest;

import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class StudentDataSourceConfiguration {

	private String drivaerName = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private String userName = "SYSTEM";
	private String password = "India123";

	@Bean
	public DataSource getDataSurce() throws SQLException {
		DataSourceBuilder<?> builder = DataSourceBuilder.create();
		builder.driverClassName(drivaerName);
		builder.url(url);
		builder.username(userName);
		builder.password(password);
		return builder.build();
	}

	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

}
