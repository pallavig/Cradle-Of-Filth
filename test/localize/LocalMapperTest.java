package localize;

import org.junit.Test;

import static localize.Locale.AUS;
import static localize.Locale.IN;
import static org.junit.Assert.assertEquals;

public class LocalMapperTest {
    @Test
    public void shouldAddLocaleForMultipleCountries() {
        LocaleMapper<Integer> numberLocaleMapper = new LocaleMapper<>();
        numberLocaleMapper.add(1, IN, "Ek");
        numberLocaleMapper.add(1, AUS, "One");

        numberLocaleMapper.add(2, IN, "Do");
        numberLocaleMapper.add(2, AUS, "Two");

        String expectedLocaleCode = "Ek";
        assertEquals(expectedLocaleCode, numberLocaleMapper.get(1, IN));

        expectedLocaleCode = "One";
        assertEquals(expectedLocaleCode, numberLocaleMapper.get(1, AUS));

        expectedLocaleCode = "Do";
        assertEquals(expectedLocaleCode, numberLocaleMapper.get(2, IN));

        expectedLocaleCode = "Two";
        assertEquals(expectedLocaleCode, numberLocaleMapper.get(2, AUS));
    }

    @Test
    public void shouldReturnEmptyStringIfMappingDoesNotExist()  {
        LocaleMapper<Integer> numberLocaleMapper = new LocaleMapper<>();
        numberLocaleMapper.add(1, IN, "Ek");

        assertEquals("", numberLocaleMapper.get(1, AUS));

    }
}
