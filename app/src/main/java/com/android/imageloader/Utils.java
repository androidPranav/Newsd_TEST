package com.android.imageloader;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Balram on 4/10/2015.
 */
public class Utils {

    public static void CopyStream(InputStream is, OutputStream os)
    {
        final int buffer_size=1024;
        try
        {
            byte[] bytes=new byte[buffer_size];
            for(;;)
            {
                int count=is.read(bytes, 0, buffer_size);
                if(count==-1)
                    break;
                os.write(bytes, 0, count);
            }
        }
        catch(Exception ex){}
    }
}
