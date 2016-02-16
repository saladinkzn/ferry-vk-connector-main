package api.impl;

import ru.shadam.ferry.implicit.ImplicitParameterProvider;

/**
 * @author sala
 */
class ConstStringProvider implements ImplicitParameterProvider {
    private final String accessToken;

    public ConstStringProvider(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String provideValue() {
        return accessToken;
    }
}
