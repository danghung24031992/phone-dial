using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Phone.Dial.RNPhoneDial
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNPhoneDialModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNPhoneDialModule"/>.
        /// </summary>
        internal RNPhoneDialModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNPhoneDial";
            }
        }
    }
}
