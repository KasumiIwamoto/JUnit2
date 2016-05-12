package snake.camel;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class SnakecamelTest {

	@Test
	public void スネークケースの文字列をキャメルケースの文字列に変換する() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = snake.snakeToCamelcase("abc_def");
		assertThat(actual,is(expected));
	}
	@Test
	public void キャメルケースの文字列をスネークケースの文字列に変換する() {
		SnakeCamelUtil camel = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = camel.camelToSnakecase("AbcDef");
		assertThat(actual,is(expected));
	}

}
