import weblogic.servlet.logging.CustomELFLogger;
import weblogic.servlet.logging.FormatStringBuffer;
import weblogic.servlet.logging.HttpAccountingInfo;

/**
 * Created by zhang on 2016/6/17.
 * for x-Protocol
 */
public class Protocol implements CustomELFLogger{

    @Override
    public void logField(HttpAccountingInfo httpAccountingInfo, FormatStringBuffer formatStringBuffer) {
        try {
            formatStringBuffer.appendValueOrDash(httpAccountingInfo.getProtocol());
        }catch (Exception e){
            formatStringBuffer.appendValueOrDash("-");
        }
    }
}
