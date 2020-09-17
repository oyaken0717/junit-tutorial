package junit.tutorial;

import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Test;

public class IsDateTest {

	@Test
	public void 日付の比較() throws Exception{
		Date date = new Date();
		assertThat(date, is(IsDate.dateOf(2011,2,10)));
	}

}
