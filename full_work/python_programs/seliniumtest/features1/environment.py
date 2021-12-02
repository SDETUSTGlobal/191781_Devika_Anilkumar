from helper.helper_web import get_browser

caps = {}


def before_all(context):
    caps['browserName'] = context.config.userdata['browser']
    caps['version'] = context.config.userdata['browser_version']
    caps['platform'] = context.config.userdata['platform']

    helper_func = get_browser(caps['browserName'], caps['version'], caps['platform'], context.config.userdata['name'],
                              context.config.userdata['app_key'])
    context.helperfunc = helper_func


def after_all(context):
    context.helperfunc.close()