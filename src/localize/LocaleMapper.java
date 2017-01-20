package localize;

import java.util.HashMap;
import java.util.Map;

public class LocaleMapper<Type> {
    private Map<Type, Map<Locale, String>> localeMapper;

    public LocaleMapper() {
        localeMapper = new HashMap<>();
    }

    public void add(Type entity, Locale countryCode, String localeCode) {
        if (localeMapper.containsKey(entity)) {
            localeMapper.get(entity).put(countryCode, localeCode);
            return;
        }

        localeMapper.put(entity, new HashMap<Locale,String>() {{
                put(countryCode, localeCode);
            }});
    }

    public String get(Type entity, Locale countryCode) {
        String localeCode = localeMapper.get(entity).get(countryCode);
        return localeCode == null ? "": localeCode;
    }
}
