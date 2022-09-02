import java.util.ArrayList;

public class App {
    private static String[] splittedTexts;

    public static void main(String[] args) throws Exception {
        //   convertToJson();
   //    joinJsonToString();
        convertJsonToOtherLanguage();
    }

    public static void joinJsonToString() {
        String json = """
            \"miningProfit\":\"Mining Profit\",
            \"hashrateTrend\":\"Hashrate Trend\",
            \"cummulativeEarnings\":\"Cummulative Earnings\",
            \"h24Profit\":\"24H Profit\",
            \"h10Min\":\"10 Min\",
            \"h1Hour\":\"1 hour\",
            \"h1Day\":\"1 Day\",
            \"statistics\": \"Statistics\",
            \"twoFactorAuthentication\":\"Two-Factor Authentication\",
            \"authTurnedOff\":\"Your two-factor authentication has been turned off.\",
            \"enableAuthentication\":\"Enable authentication\",
            \"pleaseDownloadTheApplicationGoogleAuthenticatorOnYourMobileDeviceAndScanTheCode\":\"1. Please download the application Google Authenticator on your mobile device and scan the code below. Please disregard this step if you have already done it before it.\",
            \"pleaseEnterTheGeneratedCodeBelowANewCodeWillBeGeneratedAutomaticallyEvery30Seconds\":\"2. Please enter the generated code below; a new code will be generated automatically every 30 seconds and will be used to secure your login and wallet transactions such as withdrawal.\",
            \"enable2fa\":\"Enable 2FA\",
            \"enabledSuccessfully\":\"Enabled Successfully\",
            \"theCodeEnteredDoesNotMatch\":\"The code entered does not match.\",
             \"verifyCode\":\"Verify Code\",
            \"toProceedPleaseEnterTheCodeFromTheGoogleAuthenticatorApplication\":\"To proceed, please enter the code from the Google Authenticator application.\",
            \"verify\":\"Verify\",
            \"theCodeEnteredDoesNotMatch\":\"The code entered does not match.\",
             \"wallet\":\"Wallet\",
            \"estAmount\":\"EST. Amount\",
            \"receive\":\"Receive\",
            \"send\":\"Send\",
            \"isCurrentlyUnavailaleWeWouldNotifyYouOnceItIsAvailiable\":\"is currently unavailale, we would notify you once it is availiable\",
            \"frozen\":\"Frozen\",
            \"noData\":\"No Data!\",
            \"noDataFoundPleaseCheckBackLaterForYourTransactionHistory\":\"No data found, please check back later for your transaction history\",
            \"hash\":\"Hash\",
            \"youShouldOnlySend\":\"You should only send\",
            \"toThisAddressSendingAnyOtherCoinsMayResultInPermanentLoss\":\"to this address. Sending any other coins may result in permanent loss.\",
            \"copy\":\"Copy\",
            \"walletAddressHasBeenCopiedToYourClipboard\":\"Wallet address has been copied to your clipboard\",
            \"share\":\"Share\",
            \"shareWalletAddress\":\"Share wallet address\",
             \"noAssetFoundKindlyEnterANewSearchQuery\":\"No asset found, kindly enter a new search query\",
            \"noDataFoundPleaseCheckBackLater\":\"No data found, please check back later\", 
            \"search\":\"Search\",
             \"yourTransactionWasSentSuccessfully\":\"Your transaction was sent successfully.\",
            \"transactionConfirmation\":\"Transaction Confirmation\",
            \"doYouWantToTransferThisAmountToTheSelectedAddress\":\"Do you want to transfer this amount to the selected address?\",
            \"confirm\":\"Confirm\",
            \"transactionStatus\":\"Transaction Status\",
            \"asset\":\"Asset\",
            \"to\":\"To\",
            \"maxTotal\":\"Max Total\",
            \"continueH\":\"Continue\",
            \"amount\":\"Amount\",
            \"max\":\"Max\",
            \"pleaseProvideTheAmount\":\"Please provide the amount\",
            \"pleaseEnterAValidAmount\":\"Please enter a valid amount\",
            \"youCanNotSendMoreThanYouPresentlyHave\":\"You can not send more than you presently have.\",
            \"recipientAdddress\":\"Recipient Adddress\",
            \"pleaseProvideTheRecipientAddress\":\"Please provide the recipient address.\",
            \"permissionsNotGranted\":\"Permissions not granted\"""";

        final String[] allStrings = json.split("\",");
        ArrayList<String[]> allValues = new ArrayList<>();
        for (int i = 0; i < allStrings.length; i++) {

            final String[] keyValuePair = allStrings[i].replaceAll("\"", "").split(":");

            String[] data = {
                    keyValuePair[0],
                    keyValuePair[1],
            };
            allValues.add(data);
        }

        for (int i = 0; i < allValues.size(); i++) {
            System.out.println(allValues.get(i)[1].trim());
            System.out.println();
        }

    }

    public static void convertJsonToOtherLanguage() {
        String json = """
            \"miningProfit\":\"Mining Profit\",
            \"hashrateTrend\":\"Hashrate Trend\",
            \"cummulativeEarnings\":\"Cummulative Earnings\",
            \"h24Profit\":\"24H Profit\",
            \"h10Min\":\"10 Min\",
            \"h1Hour\":\"1 hour\",
            \"h1Day\":\"1 Day\",
            \"statistics\": \"Statistics\",
            \"twoFactorAuthentication\":\"Two-Factor Authentication\",
            \"authTurnedOff\":\"Your two-factor authentication has been turned off.\",
            \"enableAuthentication\":\"Enable authentication\",
            \"pleaseDownloadTheApplicationGoogleAuthenticatorOnYourMobileDeviceAndScanTheCode\":\"1. Please download the application Google Authenticator on your mobile device and scan the code below. Please disregard this step if you have already done it before it.\",
            \"pleaseEnterTheGeneratedCodeBelowANewCodeWillBeGeneratedAutomaticallyEvery30Seconds\":\"2. Please enter the generated code below; a new code will be generated automatically every 30 seconds and will be used to secure your login and wallet transactions such as withdrawal.\",
            \"enable2fa\":\"Enable 2FA\",
            \"enabledSuccessfully\":\"Enabled Successfully\",
            \"theCodeEnteredDoesNotMatch\":\"The code entered does not match.\",
             \"verifyCode\":\"Verify Code\",
            \"toProceedPleaseEnterTheCodeFromTheGoogleAuthenticatorApplication\":\"To proceed, please enter the code from the Google Authenticator application.\",
            \"verify\":\"Verify\",
            \"theCodeEnteredDoesNotMatch\":\"The code entered does not match.\",
             \"wallet\":\"Wallet\",
            \"estAmount\":\"EST. Amount\",
            \"receive\":\"Receive\",
            \"send\":\"Send\",
            \"isCurrentlyUnavailaleWeWouldNotifyYouOnceItIsAvailiable\":\"is currently unavailale, we would notify you once it is availiable\",
            \"frozen\":\"Frozen\",
            \"noData\":\"No Data!\",
            \"noDataFoundPleaseCheckBackLaterForYourTransactionHistory\":\"No data found, please check back later for your transaction history\",
            \"hash\":\"Hash\",
            \"youShouldOnlySend\":\"You should only send\",
            \"toThisAddressSendingAnyOtherCoinsMayResultInPermanentLoss\":\"to this address. Sending any other coins may result in permanent loss.\",
            \"copy\":\"Copy\",
            \"walletAddressHasBeenCopiedToYourClipboard\":\"Wallet address has been copied to your clipboard\",
            \"share\":\"Share\",
            \"shareWalletAddress\":\"Share wallet address\",
             \"noAssetFoundKindlyEnterANewSearchQuery\":\"No asset found, kindly enter a new search query\",
            \"noDataFoundPleaseCheckBackLater\":\"No data found, please check back later\", 
            \"search\":\"Search\",
             \"yourTransactionWasSentSuccessfully\":\"Your transaction was sent successfully.\",
            \"transactionConfirmation\":\"Transaction Confirmation\",
            \"doYouWantToTransferThisAmountToTheSelectedAddress\":\"Do you want to transfer this amount to the selected address?\",
            \"confirm\":\"Confirm\",
            \"transactionStatus\":\"Transaction Status\",
            \"asset\":\"Asset\",
            \"to\":\"To\",
            \"maxTotal\":\"Max Total\",
            \"continueH\":\"Continue\",
            \"amount\":\"Amount\",
            \"max\":\"Max\",
            \"pleaseProvideTheAmount\":\"Please provide the amount\",
            \"pleaseEnterAValidAmount\":\"Please enter a valid amount\",
            \"youCanNotSendMoreThanYouPresentlyHave\":\"You can not send more than you presently have.\",
            \"recipientAdddress\":\"Recipient Adddress\",
            \"pleaseProvideTheRecipientAddress\":\"Please provide the recipient address.\",
            \"permissionsNotGranted\":\"Permissions not granted\"""";

           String otherLanguage = """
            挖矿利润

算力趋势

累计收益

24小时盈利

10 分钟

1小时

1天

统计数据

双重身份验证

您的双因素身份验证已关闭。

启用身份验证

1. 请在您的移动设备上下载应用程序谷歌身份验证器并扫描下方二维码。如果您之前已经完成此步骤，请忽略此步骤。

2. 请在下方输入生成的代码；每 30 秒将自动生成一个新代码，用于保护您的登录和钱包交易，例如提款。

启用 2FA

启用成功

输入的代码不匹配。

验证码

要继续，请输入来自 Google Authenticator 应用程序的代码。

核实

输入的代码不匹配。

钱包

美东时间。数量

收到

发送

目前不可用，一旦可用，我们会通知您

冷冻

没有数据！

未找到数据，请稍后再回来查看您的交易记录

哈希

你应该只发送

到这个地址。发送任何其他硬币可能会导致永久性损失。

复制

钱包地址已复制到您的剪贴板

分享

分享钱包地址

未找到资产，请输入新的搜索查询

未找到数据，请稍后再查看

搜索

您的交易已成功发送。

交易确认

您想将此金额转入所选地址吗？

确认

交易状态

资产

至

最大总数

继续

数量

最大限度

请提供金额

请输入有效金额

你不能发送比你现在拥有的更多的东西。

收件人地址

请提供收件人地址。

未授予权限""";

        final String[] allStrings = json.split("\",");
        ArrayList<String[]> allValues = new ArrayList<>();
        for (int i = 0; i < allStrings.length; i++) {

            final String[] keyValuePair = allStrings[i].replaceAll("\"", "").split(":");

            String[] data = {
                    keyValuePair[0],
                    keyValuePair[1],
            };
            allValues.add(data);
        }

        final String[] allStrings2 = otherLanguage.split("\n\n");
        for (int i = 0; i < allValues.size(); i++) {
            System.out.println("\"" + allValues.get(i)[0].trim() + "\":\"" + allStrings2[i].trim() + "\",");

        }

    }

    public static void convertToJson() {

        final ArrayList<String> allStringKeys = new ArrayList<>();
        String[] allStrings = {
                "Please provide the amount",
                "Please enter a valid amount",
                "You can not send more than you presently have.",
                "Recipient Adddress",
                "Continue",
                "Please provide the recipient address.",
                "Permissions not granted"
        
        };

        for (int i = 0; i < allStrings.length; i++) {
            final String data = allStrings[i];

            splittedTexts = data.split(" ");
            String newData = "";

            for (int j = 0; j < splittedTexts.length; j++) {
                String newTT = splittedTexts[j].replaceAll("\\.", "").replaceAll("\\'", "").replaceAll("\\,", "")
                        .replaceAll("\\'", "");

                if (j == 0) {
                    newData += newTT.toLowerCase();
                } else {
                    newData += newTT.substring(0, 1).toUpperCase()
                            + newTT.substring(1).toLowerCase();
                }
            }
            allStringKeys.add(newData);
        }

        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i < allStringKeys.size(); i++) {
            System.out.println("\"" + allStringKeys.get(i) + "\":\"" + allStrings[i].trim() + "\",");
        }
        System.out.println(" ");
        System.out.println(" ");

        for (int i = 0; i < allStringKeys.size(); i++) {
            System.out.println("AppLocalizations.of(context)!." + allStringKeys.get(i));
        }
    }

}
