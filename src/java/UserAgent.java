import weblogic.servlet.logging.CustomELFLogger;
import weblogic.servlet.logging.FormatStringBuffer;
import weblogic.servlet.logging.HttpAccountingInfo;

/**
 * Created by zhang on 2016/6/17.
 *
 * for x-UserAgent
 */
public class UserAgent implements CustomELFLogger{

    @Override
    public void logField(HttpAccountingInfo httpAccountingInfo, FormatStringBuffer formatStringBuffer) {
        try {
            formatStringBuffer.appendValueOrDash(httpAccountingInfo.getHeader("User-Agent"));
        }catch (Exception e){
            formatStringBuffer.appendValueOrDash("-");
        }
    }
}
