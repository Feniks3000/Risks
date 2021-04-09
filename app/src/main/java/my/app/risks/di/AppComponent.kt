package my.app.risks.di

import dagger.Component
import my.app.risks.di.module.AppModule
import my.app.risks.di.module.CiceroneModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        CiceroneModule::class
    ]
)
interface AppComponent {
}