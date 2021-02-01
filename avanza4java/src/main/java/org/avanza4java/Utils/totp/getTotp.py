import argparse
import mintotp
import sys

description = """Script to generate TOTP secret for provided TOTP key """


def createTotpKey(totpKey):
    return mintotp.totp(totpKey)


def main(argv):
    parser = argparse.ArgumentParser(description=description, formatter_class=argparse.RawTextHelpFormatter)
    parser.add_argument("--totpkey", "-t", dest="totpKey", type=str, required=True)
    args = parser.parse_args()
    print(createTotpKey(args.totpKey))


if __name__ == "__main__": main(sys.argv)
