import org.junit.jupiter.api.extension.*;
import org.junit.jupiter.api.Test;

public class BankAccountParamRes implements ParameterResolver{
    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType() == BankAccount.class;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) throws ParameterResolutionException {
        return new BankAccount(0,0);
    }
}
