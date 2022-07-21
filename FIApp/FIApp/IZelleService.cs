using System;
using System.Collections;

namespace FIApp
{
    public interface IZelleService
    {
        void launchZell(String applicationName, String baseUrl, String institutionId, String ssoKey, String product, IDictionary data);
    }
}
