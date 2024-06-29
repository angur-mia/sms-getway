package me.capcom.smsgateway.modules.ping

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val pingModule = module {
    singleOf(::PingService)
}