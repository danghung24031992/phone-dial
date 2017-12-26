#import <UIKit/UIKit.h>
#import "RNPhoneDial.h"

@implementation RNPhoneDial

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(immediatePhoneCall:(NSString *)number)
{
    [[UIApplication sharedApplication] openURL:[NSURL URLWithString:[NSString stringWithFormat:@"tel:%@", number]]];
};
@end
  