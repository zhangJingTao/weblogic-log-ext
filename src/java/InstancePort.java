import weblogic.servlet.logging.CustomELFLogger;
import weblogic.servlet.logging.FormatStringBuffer;
import weblogic.servlet.logging.HttpAccountingInfo;

/**
 * Created by zhang on 2016/6/17.
 * for x-InstancePort
 */
public class InstancePort implements CustomELFLogger{
    @Override
    public void logField(HttpAccountingInfo httpAccountingInfo, FormatStringBuffer formatStringBuffer) {
        try {
            formatStringBuffer.appendValueOrDash(httpAccountingInfo.getRemoteAddr().split(":")[1]);
        }catch (Exception e){//default port 80
            formatStringBuffer.appendValueOrDash("80");
        }
    }
}
