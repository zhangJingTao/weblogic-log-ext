import weblogic.servlet.logging.CustomELFLogger;
import weblogic.servlet.logging.FormatStringBuffer;
import weblogic.servlet.logging.HttpAccountingInfo;

/**
 * Created by zhang on 2016/6/17.
 * for x-Referrer
 */
public class Referrer implements CustomELFLogger{
    @Override
    public void logField(HttpAccountingInfo httpAccountingInfo, FormatStringBuffer formatStringBuffer) {
        try {
            formatStringBuffer.appendValueOrDash(httpAccountingInfo.getHeader("Referer"));
        }catch (Exception e){
            formatStringBuffer.appendValueOrDash("-");
        }
    }
}
